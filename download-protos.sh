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

GRPC_GATEWAY_COMMIT=3c7c499cefb3fb46d0c662bcf296408a66fc5acc
NAKAMA_COMMON_COMMIT=5254da5c83ced136a4c8014a2cf2eaa85875811d
NAKAMA_COMMIT=8e8e74280915e77b02871955931f60bcea5b91a1
DOMAIN=https://raw.githubusercontent.com

OPENAPI_URL=${DOMAIN}/grpc-ecosystem/grpc-gateway/${GRPC_GATEWAY_COMMIT}/protoc-gen-swagger/options/openapiv2.proto
ANNOTATION_URL=${DOMAIN}/grpc-ecosystem/grpc-gateway/${GRPC_GATEWAY_COMMIT}/protoc-gen-swagger/options/annotations.proto
API_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/api/api.proto
REALTIME_URL=${DOMAIN}/heroiclabs/nakama-common/${NAKAMA_COMMON_COMMIT}/rtapi/realtime.proto
APIGRPC_URL=${DOMAIN}/heroiclabs/nakama/${NAKAMA_COMMIT}/apigrpc/apigrpc.proto

ROOT_DIR=src/main/proto
NAKAMA_COMMON_DIR=github.com/heroiclabs/nakama-common/api
SWAGGER_GEN_DIR=protoc-gen-swagger/options

curl $OPENAPI_URL -o ${ROOT_DIR}/${SWAGGER_GEN_DIR}/openapiv2.proto
curl $ANNOTATION_URL -o ${ROOT_DIR}/${SWAGGER_GEN_DIR}/annotations.proto
curl $API_URL -o ${ROOT_DIR}/${NAKAMA_COMMON_DIR}/api.proto
curl $REALTIME_URL -o ${ROOT_DIR}/${NAKAMA_COMMON_DIR}/realtime.proto
curl $APIGRPC_URL -o src/main/proto/apigrpc.proto
