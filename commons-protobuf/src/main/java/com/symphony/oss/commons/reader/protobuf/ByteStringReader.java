/*
 *
 *
 * Copyright 2018 Symphony Communication Services, LLC.
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

package com.symphony.oss.commons.reader.protobuf;

import java.io.InputStreamReader;
import java.nio.charset.Charset;

import com.google.protobuf.ByteString;

public class ByteStringReader extends InputStreamReader
{

  public ByteStringReader(ByteString input)
  {
    super(new ByteStringInputStream(input));
  }
  
  public ByteStringReader(ByteString input, Charset charset)
  {
    super(new ByteStringInputStream(input), charset);
  }
}
