# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: syft_proto/types/syft/v1/id.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='syft_proto/types/syft/v1/id.proto',
  package='syft_proto.types.syft.v1',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n!syft_proto/types/syft/v1/id.proto\x12\x18syft_proto.types.syft.v1\"<\n\x02Id\x12\x17\n\x06id_int\x18\x01 \x01(\x03H\x00R\x05idInt\x12\x17\n\x06id_str\x18\x02 \x01(\tH\x00R\x05idStrB\x04\n\x02idb\x06proto3')
)




_ID = _descriptor.Descriptor(
  name='Id',
  full_name='syft_proto.types.syft.v1.Id',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id_int', full_name='syft_proto.types.syft.v1.Id.id_int', index=0,
      number=1, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='idInt', file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='id_str', full_name='syft_proto.types.syft.v1.Id.id_str', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, json_name='idStr', file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='id', full_name='syft_proto.types.syft.v1.Id.id',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=63,
  serialized_end=123,
)

_ID.oneofs_by_name['id'].fields.append(
  _ID.fields_by_name['id_int'])
_ID.fields_by_name['id_int'].containing_oneof = _ID.oneofs_by_name['id']
_ID.oneofs_by_name['id'].fields.append(
  _ID.fields_by_name['id_str'])
_ID.fields_by_name['id_str'].containing_oneof = _ID.oneofs_by_name['id']
DESCRIPTOR.message_types_by_name['Id'] = _ID
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Id = _reflection.GeneratedProtocolMessageType('Id', (_message.Message,), dict(
  DESCRIPTOR = _ID,
  __module__ = 'syft_proto.types.syft.v1.id_pb2'
  # @@protoc_insertion_point(class_scope:syft_proto.types.syft.v1.Id)
  ))
_sym_db.RegisterMessage(Id)


# @@protoc_insertion_point(module_scope)
