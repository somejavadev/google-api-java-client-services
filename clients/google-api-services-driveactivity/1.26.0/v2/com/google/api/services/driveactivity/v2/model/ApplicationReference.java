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

package com.google.api.services.driveactivity.v2.model;

/**
 * Activity in applications other than Drive.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ApplicationReference extends com.google.api.client.json.GenericJson {

  /**
   * The reference type corresponding to this event.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The reference type corresponding to this event.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The reference type corresponding to this event.
   * @param type type or {@code null} for none
   */
  public ApplicationReference setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public ApplicationReference set(String fieldName, Object value) {
    return (ApplicationReference) super.set(fieldName, value);
  }

  @Override
  public ApplicationReference clone() {
    return (ApplicationReference) super.clone();
  }

}