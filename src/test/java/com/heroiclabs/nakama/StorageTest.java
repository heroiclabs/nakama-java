package com.heroiclabs.nakama;

import static org.junit.Assert.assertEquals;

import com.heroiclabs.nakama.api.StorageObjectAcks;
import com.heroiclabs.nakama.api.StorageObjectList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StorageTest {

  private Client client;
  private Session session;

  @Before
  public void init() throws Exception {
    client = new DefaultClient("defaultkey");
    session = client.authenticateCustom(UUID.randomUUID().toString()).get();
  }

  @After
  public void shutdown() throws Exception {
    client.disconnect(5000, TimeUnit.MILLISECONDS);
  }

  @Test
  public void testReadCollection() throws Exception{
    final String collection = "tmpCollection";
    final long timeoutInSec = 5;

    StorageObjectWrite o1 = new StorageObjectWrite(
        collection,
        "key1",
        "{\"n\" : \"1\"}",
        PermissionRead.PUBLIC_READ,
        PermissionWrite.OWNER_WRITE);

    StorageObjectWrite o2 = new StorageObjectWrite(
        collection,
        "key2",
        "{\"n\" : \"2\"}",
        PermissionRead.PUBLIC_READ,
        PermissionWrite.OWNER_WRITE);

    // persist 2 records
    StorageObjectAcks resWrite = client.writeStorageObjects(session, o1, o2)
        .get(timeoutInSec, TimeUnit.SECONDS);
    assert resWrite.getAcksList().size() == 2;

    // expect to read 2 records
    StorageObjectList resRead = client
        .listUsersStorageObjects(session, collection, session.getUserId(), 2)
        .get(timeoutInSec, TimeUnit.SECONDS);
    assertEquals(2, resRead.getObjectsCount());
  }

}
