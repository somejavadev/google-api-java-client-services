/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.alertcenter.v1beta1.model;

/**
 * Representation of a single data row in a CSV file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Alert Center API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CsvRow extends com.google.api.client.json.GenericJson {

  /**
   * Data entries in a CSV file row, as a string array rather than a single comma-separated string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> entries;

  /**
   * Data entries in a CSV file row, as a string array rather than a single comma-separated string.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEntries() {
    return entries;
  }

  /**
   * Data entries in a CSV file row, as a string array rather than a single comma-separated string.
   * @param entries entries or {@code null} for none
   */
  public CsvRow setEntries(java.util.List<java.lang.String> entries) {
    this.entries = entries;
    return this;
  }

  @Override
  public CsvRow set(String fieldName, Object value) {
    return (CsvRow) super.set(fieldName, value);
  }

  @Override
  public CsvRow clone() {
    return (CsvRow) super.clone();
  }

}
