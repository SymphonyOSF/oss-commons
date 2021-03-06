/*
 *
 *
 * Copyright 2017 Symphony Communication Services, LLC.
 *
 * Licensed to The Symphony Software Foundation (SSF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The SSF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.symphony.oss.commons.dom.json;

import org.apache.commons.codec.binary.Base64;

import com.symphony.oss.commons.immutable.ImmutableByteArray;
import com.symphony.oss.commons.type.provider.IImmutableByteArrayProvider;

public class JsonBase64String extends JsonString implements IImmutableByteArrayProvider
{
  private ImmutableByteArray immutableByteArray_;

  public JsonBase64String(String value)
  {
    super(value);
    
    
  }

  @Override
  public synchronized ImmutableByteArray asImmutableByteArray()
  {
    if(immutableByteArray_ == null)
      immutableByteArray_ = ImmutableByteArray.newInstance(Base64.decodeBase64(getValue()));
    
    return immutableByteArray_;
  }

}
