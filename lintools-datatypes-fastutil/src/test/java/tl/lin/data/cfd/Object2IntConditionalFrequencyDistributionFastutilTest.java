/*
 * Lintools: tools by @lintool
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package tl.lin.data.cfd;

import junit.framework.JUnit4TestAdapter;

import org.junit.Test;

public class Object2IntConditionalFrequencyDistributionFastutilTest extends 
   Object2IntConditionalFrequencyDistributionTestBase {

  @Test
  public void test1Fastutil() {
    Object2IntConditionalFrequencyDistribution<String> cfd =
        new Object2IntConditionalFrequencyDistributionFastutil<String>();
    test1Common(cfd);
  }

  @Test
  public void test2Fastutil() {
    Object2IntConditionalFrequencyDistribution<String> cfd =
        new Object2IntConditionalFrequencyDistributionFastutil<String>();
    test2Common(cfd);
  }

  @Test
  public void test3Fastutil() {
    Object2IntConditionalFrequencyDistribution<String> cfd =
        new Object2IntConditionalFrequencyDistributionFastutil<String>();
    test3Common(cfd);
  }

  @Test
  public void testLargeMarginalFastutil() {
    Object2IntConditionalFrequencyDistribution<String> cfd =
        new Object2IntConditionalFrequencyDistributionFastutil<String>();
    testLargeMarginalCommon(cfd);
  }

  public static junit.framework.Test suite() {
    return new JUnit4TestAdapter(Object2IntConditionalFrequencyDistributionFastutilTest.class);
  }
}
