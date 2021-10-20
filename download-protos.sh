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

GRPC_GATEWAY_COMMIT=bcc34ef50bda81faae5d4bbfca2e7ea8fe4700c8 ## v2.3.0
NAKAMA_COMMON_COMMIT=f56456e88e9116f9d37c05e0f3cb7b48f934ad73 ## v1.9.0
NAKAMA_COMMIT=9e8accdcf3eb37b89674b8c9dbb54db989d377b0 ## v3.8.0
PROTOBUF_COMMIT=dfab275eca9481b5de31122db6fc91b31db3382a
DOMAIN=https://raw.githubusercontent.com


OPENAPI_URL=${DOMAIN}/grpc-ecosystem/grpc-gateway/${GRPC_GATEWAY_COMMIT}/protoc-gen-openapiv2/options/openapiv2.proto
ANNOTATION_URL=${DOMAIN}/grpc-ecosystem/grpc-gateway/${GRPC_GATEWAY_COMMIT}/protoc-gen-openapiv2/options/annotations.proto
API_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/api/api.proto
REALTIME_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/rtapi/realtime.proto
APIGRPC_URL=${DOMAIN}/heroiclabs/nakama/${NAKAMA_COMMIT}/apigrpc/apigrpc.proto

### java proto-lite does not contain descriptor.proto
DESCRIPTOR_URL=${DOMAIN}/protocolbuffers/protobuf/${PROTOBUF_COMMIT}/src/google/protobuf/descriptor.proto

ROOT_DIR=src/main/proto
NAKAMA_COMMON_DIR=github.com/heroiclabs/nakama-common/api
SWAGGER_GEN_DIR=protoc-gen-openapiv2/options

curl $OPENAPI_URL -o ${ROOT_DIR}/${SWAGGER_GEN_DIR}/openapiv2.proto
curl $ANNOTATION_URL -o ${ROOT_DIR}/${SWAGGER_GEN_DIR}/annotations.proto
curl $API_URL -o ${ROOT_DIR}/${NAKAMA_COMMON_DIR}/api.proto
curl $REALTIME_URL -o ${ROOT_DIR}/${NAKAMA_COMMON_DIR}/realtime.proto
curl $APIGRPC_URL -o ${ROOT_DIR}/apigrpc.proto
curl $DESCRIPTOR_URL -o ${ROOT_DIR}/google/protobuf/descriptor.proto
