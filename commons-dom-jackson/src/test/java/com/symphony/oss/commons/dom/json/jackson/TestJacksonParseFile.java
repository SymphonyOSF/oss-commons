/*
 *
 *
 * Copyright 2020 Symphony Communication Services, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.symphony.oss.commons.dom.json.jackson;

import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.symphony.oss.commons.dom.DomSerializer;
import com.symphony.oss.commons.dom.json.IJsonDomNode;

@SuppressWarnings("javadoc")
public class TestJacksonParseFile
{
  @Test
  public void testParseFile() throws IOException
  {
    try(InputStream in = getClass().getResourceAsStream("/oneOfEverything.json"))
    {
      System.err.println("in " + in);
    
      DomSerializer serializer = DomSerializer.newBuilder()
          .withCanonicalMode(true)
          .build();
      
      ObjectMapper mapper = new ObjectMapper();
      
      JsonNode tree = mapper.readTree(in);
      
      System.out.println("Jackson DOM:");
      System.out.println(tree);
      
      IJsonDomNode adaptor = JacksonAdaptor.adapt(tree);
      
      System.out.println(serializer.serialize(adaptor));
    }
  }
}