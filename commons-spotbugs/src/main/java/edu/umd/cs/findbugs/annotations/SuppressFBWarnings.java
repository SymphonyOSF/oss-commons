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
 * ----------------------------------------------------------------------------
 * This is a clean room implementation of a subset of the findbugs / spotbugs 
 * annotations based solely upon the javadocs.
 */

package edu.umd.cs.findbugs.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Suppress one or more findbugs warnings.
 * 
 * @author Bruce Skingle
 *
 */
@Retention(value=RetentionPolicy.CLASS)
public @interface SuppressFBWarnings
{
  /**
   * Return the bug category, kind or pattern to be suppressed.
   * 
   * @return the bug category, kind or pattern to be suppressed.
   */
   String[] value() default
     {
     };
  
  /**
   * Return the bug category, kind or pattern to be suppressed.
   * 
   * @return the bug category, kind or pattern to be suppressed.
   */
   String justification() default
     "";
}
