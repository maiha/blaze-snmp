/*
 * Copyright (c) 2013 Scott Abernethy.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package blazesnmp

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

class ObjectIdentifierSuite extends FunSuite with ShouldMatchers {
  test("create from string") {
    ObjectIdentifier.create("1.3.1.6.2509.8.0").toSeq should equal(List(1,3,1,6,2509,8,0))
    ObjectIdentifier.create(".1.3.1.6.2509.8.0").toSeq should equal(List(1,3,1,6,2509,8,0))
  }
}
