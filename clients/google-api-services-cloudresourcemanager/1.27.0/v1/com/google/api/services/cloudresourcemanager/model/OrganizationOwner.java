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

package com.google.api.services.cloudresourcemanager.model;

/**
 * The entity that owns an Organization. The lifetime of the Organization and all of its descendants
 * are bound to the `OrganizationOwner`. If the `OrganizationOwner` is deleted, the Organization and
 * all its descendants will be deleted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Resource Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OrganizationOwner extends com.google.api.client.json.GenericJson {

  /**
   * The G Suite customer id used in the Directory API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String directoryCustomerId;

  /**
   * The G Suite customer id used in the Directory API.
   * @return value or {@code null} for none
   */
  public java.lang.String getDirectoryCustomerId() {
    return directoryCustomerId;
  }

  /**
   * The G Suite customer id used in the Directory API.
   * @param directoryCustomerId directoryCustomerId or {@code null} for none
   */
  public OrganizationOwner setDirectoryCustomerId(java.lang.String directoryCustomerId) {
    this.directoryCustomerId = directoryCustomerId;
    return this;
  }

  @Override
  public OrganizationOwner set(String fieldName, Object value) {
    return (OrganizationOwner) super.set(fieldName, value);
  }

  @Override
  public OrganizationOwner clone() {
    return (OrganizationOwner) super.clone();
  }

}