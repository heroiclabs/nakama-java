// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: github.com/heroiclabs/nakama-common/api/realtime.proto
// Protobuf Java Version: 4.28.2

package com.heroiclabs.nakama.realtime;

public interface NotificationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nakama.realtime.Notifications)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  java.util.List<com.heroiclabs.nakama.api.Notification> 
      getNotificationsList();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  com.heroiclabs.nakama.api.Notification getNotifications(int index);
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  int getNotificationsCount();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  java.util.List<? extends com.heroiclabs.nakama.api.NotificationOrBuilder> 
      getNotificationsOrBuilderList();
  /**
   * <pre>
   * Collection of notifications.
   * </pre>
   *
   * <code>repeated .nakama.api.Notification notifications = 1 [json_name = "notifications"];</code>
   */
  com.heroiclabs.nakama.api.NotificationOrBuilder getNotificationsOrBuilder(
      int index);
}
