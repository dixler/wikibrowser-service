/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.javafxpert.wikibrowser;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @author James Weaver
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bindings {
  private PropUrl propUrl;
  private PropLabel propLabel;
  private ValUrl valUrl;
  private ValLabel valLabel;

  public Bindings() {
  }

  public PropUrl getPropUrl() {
    return propUrl;
  }

  public PropLabel getPropLabel() {
    return propLabel;
  }

  public ValUrl getValUrl() {
    return valUrl;
  }

  public ValLabel getValLabel() {
    return valLabel;
  }

  public void setPropUrl(PropUrl propUrl) {
    this.propUrl = propUrl;
  }

  public void setPropLabel(PropLabel propLabel) {
    this.propLabel = propLabel;
  }

  public void setValUrl(ValUrl valUrl) {
    this.valUrl = valUrl;
  }

  public void setValLabel(ValLabel valLabel) {
    this.valLabel = valLabel;
  }
}


