/*
 * Copyright 2017
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
 *
 */

package com.bazaarvoice.bvandroidsdk;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * Wrapper for photo metadata
 */
public class Photo {

    @SerializedName("Caption")
    private String caption;
    @SerializedName("Id")
    private String id;
    @SerializedName("Sizes")
    private Content content;

    public String getCaption() {
        return caption;
    }
    void setCaption(String caption) {
        this.caption = caption;
    }

    public String getId() {
        return id;
    }

    public Content getContent() {
        return content;
    }

    public class Content {
        private static final String kURL = "Url";

        @SerializedName("thumbnail")
        private Map<String, Object> thumbnail;
        @SerializedName("normal")
        private Map<String, Object> normal;

        @SerializedName("large")
        private Map<String, Object> large;

        private transient String thumbnailUrl;
        private transient String normalUrl;
        private transient String largeUrl;

        public String getThumbnailUrl() {
            return (String) thumbnail.get(kURL);
        }

        public String getNormalUrl() {
            return (String) normal.get(kURL);
        }

        public String getLargeUrl() {
            return (String) large.get(kURL);
        }

    }
}