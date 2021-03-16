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

GRPC_GATEWAY_COMMIT=5c1639cccb7d6abc747643ed07321b0052b809d5
NAKAMA_COMMON_COMMIT=b013ccdfa0be37f97c716a477409dfe935b111f7
NAKAMA_COMMIT=ec12afadd940cd779f5b1acadc0faf33ed9fa94c
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
