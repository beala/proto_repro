load("@io_bazel_rules_scala//scala_proto:scala_proto.bzl", "scala_proto_library")
load("@io_bazel_rules_scala//scala_proto:scala_proto_toolchain.bzl", "scala_proto_toolchain")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary", "scala_test")

proto_library(
    name = "proto",
    srcs = ["macro_proto.proto"],
    visibility = ["//visibility:public"],
)

scala_proto_library(
    name = "scala_proto",
    visibility = ["//visibility:public"],
    deps = [":proto"],
)

scala_library(
    name = "lib",
    srcs = ["Test.scala"],
    deps = [":scala_proto"],
    visibility = ["//visibility:public"],
)