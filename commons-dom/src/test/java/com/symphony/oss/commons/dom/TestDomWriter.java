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

package com.symphony.oss.commons.dom;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.symphony.oss.commons.dom.DomWriter;

public class TestDomWriter
{
  @Test
  public void testIndent() throws IOException
  {
    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    
    DomWriter out = new DomWriter(bout);
    out.indent();
    
    out.writeItem("test");
    out.writeItem("This is a test");
    out.close();
    
    System.out.println(bout.toString());
    
    Assert.assertEquals("  test\n" + 
        "  This is a test\n", bout.toString());
  }
}
