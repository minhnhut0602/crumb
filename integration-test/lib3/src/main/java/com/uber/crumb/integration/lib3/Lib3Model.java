/*
 * Copyright 2018. Uber Technologies
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
 */
package com.uber.crumb.integration.lib3;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.uber.crumb.annotations.CrumbConsumable;

@AutoValue
@CrumbConsumable
public abstract class Lib3Model {

  abstract String foo();

  public static JsonAdapter<Lib3Model> jsonAdapter(Moshi moshi) {
    return new AutoValue_Lib3Model.MoshiJsonAdapter(moshi);
  }

  public static TypeAdapter<Lib3Model> typeAdapter(Gson gson) {
    return new AutoValue_Lib3Model.GsonTypeAdapter(gson);
  }

  public static Lib3Model create(String foo) {
    return new AutoValue_Lib3Model(foo);
  }
}
