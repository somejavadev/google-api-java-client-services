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

package com.google.api.services.recommender.v1beta1.model;

/**
 * Group of operations that need to be performed atomically.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommender API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommenderV1beta1OperationGroup extends com.google.api.client.json.GenericJson {

  /**
   * List of operations across one or more resources that belong to this group. Loosely based on
   * RFC6902 and should be performed in the order they appear.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRecommenderV1beta1Operation> operations;

  static {
    // hack to force ProGuard to consider GoogleCloudRecommenderV1beta1Operation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRecommenderV1beta1Operation.class);
  }

  /**
   * List of operations across one or more resources that belong to this group. Loosely based on
   * RFC6902 and should be performed in the order they appear.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRecommenderV1beta1Operation> getOperations() {
    return operations;
  }

  /**
   * List of operations across one or more resources that belong to this group. Loosely based on
   * RFC6902 and should be performed in the order they appear.
   * @param operations operations or {@code null} for none
   */
  public GoogleCloudRecommenderV1beta1OperationGroup setOperations(java.util.List<GoogleCloudRecommenderV1beta1Operation> operations) {
    this.operations = operations;
    return this;
  }

  @Override
  public GoogleCloudRecommenderV1beta1OperationGroup set(String fieldName, Object value) {
    return (GoogleCloudRecommenderV1beta1OperationGroup) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommenderV1beta1OperationGroup clone() {
    return (GoogleCloudRecommenderV1beta1OperationGroup) super.clone();
  }

}
