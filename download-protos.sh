#!/bin/bash

# Copyright 2020 The Nakama Authors.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# This command is a utility for downloading all .proto files required
# for making full source builds.

TOKEN=$1

# Check if TOKEN is empty
if [ -z "$TOKEN" ]
then
    echo "Error: GitHub personal access token is missing. Please pass the token as a parameter."
    exit 1
fi

NAKAMA_COMMON_COMMIT=v1.33.0
NAKAMA_COMMIT=v3.23.0
SATORI_COMMIT=v2.0.2
DOMAIN=https://raw.githubusercontent.com

API_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/api/api.proto
REALTIME_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/rtapi/realtime.proto
APIGRPC_URL=${DOMAIN}/heroiclabs/nakama/${NAKAMA_COMMIT}/apigrpc/apigrpc.proto
SATORI_APIGRPC_URL=${DOMAIN}/heroiclabs/satori/${SATORI_COMMIT}/api/satori.proto

ROOT_DIR=proto
curl $API_URL --create-dirs -o ${ROOT_DIR}/github.com/heroiclabs/nakama-common/api/api.proto
curl $REALTIME_URL --create-dirs -o ${ROOT_DIR}/github.com/heroiclabs/nakama-common/rtapi/realtime.proto
sed -ie 's,import "api/api.proto",import "github.com/heroiclabs/nakama-common/api/api.proto",' ${ROOT_DIR}/github.com/heroiclabs/nakama-common/rtapi/realtime.proto

curl $APIGRPC_URL --create-dirs -o ${ROOT_DIR}/github.com/heroiclabs/nakama/api/apigrpc.proto
curl -H "Authorization: token $TOKEN" $SATORI_APIGRPC_URL --create-dirs -o ${ROOT_DIR}/github.com/heroiclabs/satori/api/satori.proto
