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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * The metadata for a directory. Similar to the equivalent message in the Remote Execution API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata extends com.google.api.client.json.GenericJson {

  /**
   * A pointer to the contents of the directory, in the form of a marshalled Directory message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleDevtoolsRemoteworkersV1test2Digest digest;

  /**
   * The path of the directory, as in FileMetadata.path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * A pointer to the contents of the directory, in the form of a marshalled Directory message.
   * @return value or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2Digest getDigest() {
    return digest;
  }

  /**
   * A pointer to the contents of the directory, in the form of a marshalled Directory message.
   * @param digest digest or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata setDigest(GoogleDevtoolsRemoteworkersV1test2Digest digest) {
    this.digest = digest;
    return this;
  }

  /**
   * The path of the directory, as in FileMetadata.path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The path of the directory, as in FileMetadata.path.
   * @param path path or {@code null} for none
   */
  public GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata set(String fieldName, Object value) {
    return (GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata clone() {
    return (GoogleDevtoolsRemoteworkersV1test2DirectoryMetadata) super.clone();
  }

}