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

package com.google.cloudbuild.v1.model;

/**
 * A step in the build pipeline.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildStep extends com.google.api.client.json.GenericJson {

  /**
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args` are used as
   * arguments to that entrypoint. If the image does not define an entrypoint, the first element in
   * args is used as the entrypoint, and the remainder will be used as arguments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> args;

  /**
   * Working directory to use when running this step's container.
   *
   * If this value is a relative path, it is relative to the build's working directory. If this
   * value is absolute, it may be outside the build's working directory, in which case the contents
   * of the path may not be persisted across build step executions, unless a `volume` for that path
   * is specified.
   *
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an
   * absolute path, the `RepoSource` `dir` is ignored for the step's execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dir;

  /**
   * Entrypoint to be used instead of the build step image's default entrypoint. If unset, the
   * image's default entrypoint is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entrypoint;

  /**
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the
   * value "VALUE".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> env;

  /**
   * Unique identifier for this build step, used in `wait_for` to reference this build step as a
   * dependency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. The name of the container image that will run this particular build step.
   *
   * If the image is available in the host's Docker daemon's cache, it will be run directly. If not,
   * the host will attempt to pull the image first, using the builder service account's credentials
   * if necessary.
   *
   * The Docker daemon's cache will already have the latest versions of all of the officially
   * supported build steps ([https://github.com/GoogleCloudPlatform/cloud-
   * builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also
   * have cached many of the layers for some popular images, like "ubuntu", "debian", but they will
   * be refreshed at the time you attempt to use them.
   *
   * If you built an image in a previous build step, it will be stored in the host's Docker daemon's
   * cache and is available to use as the name for a later build step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Stores timing information for pulling this build step's builder image only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeSpan pullTiming;

  /**
   * A list of environment variables which are encrypted using a Cloud Key Management Service crypto
   * key. These values must be specified in the build's `Secret`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> secretEnv;

  /**
   * Output only. Status of the build step. At this time, build step status is only updated on build
   * completion; step status is not updated in real-time as the build progresses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Time limit for executing this build step. If not defined, the step has no time limit and will
   * be allowed to continue to run until either it completes or the build itself times out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * Output only. Stores timing information for executing this build step.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeSpan timing;

  /**
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the build step. Upon completion
   * of the build, volumes and their contents are discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative of a build request with
   * an incorrect configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * The ID(s) of the step(s) that this build step depends on. This build step will not start until
   * all the build steps in `wait_for` have completed successfully. If `wait_for` is empty, this
   * build step will start when all previous build steps in the `Build.Steps` list have completed
   * successfully.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> waitFor;

  /**
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args` are used as
   * arguments to that entrypoint. If the image does not define an entrypoint, the first element in
   * args is used as the entrypoint, and the remainder will be used as arguments.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getArgs() {
    return args;
  }

  /**
   * A list of arguments that will be presented to the step when it is started.
   *
   * If the image used to run the step's container has an entrypoint, the `args` are used as
   * arguments to that entrypoint. If the image does not define an entrypoint, the first element in
   * args is used as the entrypoint, and the remainder will be used as arguments.
   * @param args args or {@code null} for none
   */
  public BuildStep setArgs(java.util.List<java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Working directory to use when running this step's container.
   *
   * If this value is a relative path, it is relative to the build's working directory. If this
   * value is absolute, it may be outside the build's working directory, in which case the contents
   * of the path may not be persisted across build step executions, unless a `volume` for that path
   * is specified.
   *
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an
   * absolute path, the `RepoSource` `dir` is ignored for the step's execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getDir() {
    return dir;
  }

  /**
   * Working directory to use when running this step's container.
   *
   * If this value is a relative path, it is relative to the build's working directory. If this
   * value is absolute, it may be outside the build's working directory, in which case the contents
   * of the path may not be persisted across build step executions, unless a `volume` for that path
   * is specified.
   *
   * If the build specifies a `RepoSource` with `dir` and a step with a `dir`, which specifies an
   * absolute path, the `RepoSource` `dir` is ignored for the step's execution.
   * @param dir dir or {@code null} for none
   */
  public BuildStep setDir(java.lang.String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Entrypoint to be used instead of the build step image's default entrypoint. If unset, the
   * image's default entrypoint is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntrypoint() {
    return entrypoint;
  }

  /**
   * Entrypoint to be used instead of the build step image's default entrypoint. If unset, the
   * image's default entrypoint is used.
   * @param entrypoint entrypoint or {@code null} for none
   */
  public BuildStep setEntrypoint(java.lang.String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the
   * value "VALUE".
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEnv() {
    return env;
  }

  /**
   * A list of environment variable definitions to be used when running a step.
   *
   * The elements are of the form "KEY=VALUE" for the environment variable "KEY" being given the
   * value "VALUE".
   * @param env env or {@code null} for none
   */
  public BuildStep setEnv(java.util.List<java.lang.String> env) {
    this.env = env;
    return this;
  }

  /**
   * Unique identifier for this build step, used in `wait_for` to reference this build step as a
   * dependency.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Unique identifier for this build step, used in `wait_for` to reference this build step as a
   * dependency.
   * @param id id or {@code null} for none
   */
  public BuildStep setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. The name of the container image that will run this particular build step.
   *
   * If the image is available in the host's Docker daemon's cache, it will be run directly. If not,
   * the host will attempt to pull the image first, using the builder service account's credentials
   * if necessary.
   *
   * The Docker daemon's cache will already have the latest versions of all of the officially
   * supported build steps ([https://github.com/GoogleCloudPlatform/cloud-
   * builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also
   * have cached many of the layers for some popular images, like "ubuntu", "debian", but they will
   * be refreshed at the time you attempt to use them.
   *
   * If you built an image in a previous build step, it will be stored in the host's Docker daemon's
   * cache and is available to use as the name for a later build step.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The name of the container image that will run this particular build step.
   *
   * If the image is available in the host's Docker daemon's cache, it will be run directly. If not,
   * the host will attempt to pull the image first, using the builder service account's credentials
   * if necessary.
   *
   * The Docker daemon's cache will already have the latest versions of all of the officially
   * supported build steps ([https://github.com/GoogleCloudPlatform/cloud-
   * builders](https://github.com/GoogleCloudPlatform/cloud-builders)). The Docker daemon will also
   * have cached many of the layers for some popular images, like "ubuntu", "debian", but they will
   * be refreshed at the time you attempt to use them.
   *
   * If you built an image in a previous build step, it will be stored in the host's Docker daemon's
   * cache and is available to use as the name for a later build step.
   * @param name name or {@code null} for none
   */
  public BuildStep setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Stores timing information for pulling this build step's builder image only.
   * @return value or {@code null} for none
   */
  public TimeSpan getPullTiming() {
    return pullTiming;
  }

  /**
   * Output only. Stores timing information for pulling this build step's builder image only.
   * @param pullTiming pullTiming or {@code null} for none
   */
  public BuildStep setPullTiming(TimeSpan pullTiming) {
    this.pullTiming = pullTiming;
    return this;
  }

  /**
   * A list of environment variables which are encrypted using a Cloud Key Management Service crypto
   * key. These values must be specified in the build's `Secret`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSecretEnv() {
    return secretEnv;
  }

  /**
   * A list of environment variables which are encrypted using a Cloud Key Management Service crypto
   * key. These values must be specified in the build's `Secret`.
   * @param secretEnv secretEnv or {@code null} for none
   */
  public BuildStep setSecretEnv(java.util.List<java.lang.String> secretEnv) {
    this.secretEnv = secretEnv;
    return this;
  }

  /**
   * Output only. Status of the build step. At this time, build step status is only updated on build
   * completion; step status is not updated in real-time as the build progresses.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. Status of the build step. At this time, build step status is only updated on build
   * completion; step status is not updated in real-time as the build progresses.
   * @param status status or {@code null} for none
   */
  public BuildStep setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Time limit for executing this build step. If not defined, the step has no time limit and will
   * be allowed to continue to run until either it completes or the build itself times out.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * Time limit for executing this build step. If not defined, the step has no time limit and will
   * be allowed to continue to run until either it completes or the build itself times out.
   * @param timeout timeout or {@code null} for none
   */
  public BuildStep setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Output only. Stores timing information for executing this build step.
   * @return value or {@code null} for none
   */
  public TimeSpan getTiming() {
    return timing;
  }

  /**
   * Output only. Stores timing information for executing this build step.
   * @param timing timing or {@code null} for none
   */
  public BuildStep setTiming(TimeSpan timing) {
    this.timing = timing;
    return this;
  }

  /**
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the build step. Upon completion
   * of the build, volumes and their contents are discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative of a build request with
   * an incorrect configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * List of volumes to mount into the build step.
   *
   * Each volume is created as an empty volume prior to execution of the build step. Upon completion
   * of the build, volumes and their contents are discarded.
   *
   * Using a named volume in only one step is not valid as it is indicative of a build request with
   * an incorrect configuration.
   * @param volumes volumes or {@code null} for none
   */
  public BuildStep setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  /**
   * The ID(s) of the step(s) that this build step depends on. This build step will not start until
   * all the build steps in `wait_for` have completed successfully. If `wait_for` is empty, this
   * build step will start when all previous build steps in the `Build.Steps` list have completed
   * successfully.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWaitFor() {
    return waitFor;
  }

  /**
   * The ID(s) of the step(s) that this build step depends on. This build step will not start until
   * all the build steps in `wait_for` have completed successfully. If `wait_for` is empty, this
   * build step will start when all previous build steps in the `Build.Steps` list have completed
   * successfully.
   * @param waitFor waitFor or {@code null} for none
   */
  public BuildStep setWaitFor(java.util.List<java.lang.String> waitFor) {
    this.waitFor = waitFor;
    return this;
  }

  @Override
  public BuildStep set(String fieldName, Object value) {
    return (BuildStep) super.set(fieldName, value);
  }

  @Override
  public BuildStep clone() {
    return (BuildStep) super.clone();
  }

}
