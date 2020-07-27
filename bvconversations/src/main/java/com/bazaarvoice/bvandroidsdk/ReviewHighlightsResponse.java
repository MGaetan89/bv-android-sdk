package com.bazaarvoice.bvandroidsdk;
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

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Response to a {@link ReviewHighlightsRequest}
 */

public class ReviewHighlightsResponse  extends ConversationsDisplayResponse {

   @SerializedName("subjects") private ReviewHighlights reviewHighlights;
   @SerializedName("error") private String error;
   private transient List<Error> errors;


    public  ReviewHighlights getReviewHighlights() {
        return reviewHighlights;
    }

    public Boolean getHasErrors() {
        return error!= null ;
    }

    public List<Error> getErrors() {
        if(errors == null){
            Error reviewHighlightsError = new Error(error,null);
            errors = new ArrayList<Error>(Arrays.asList(reviewHighlightsError));
        }
        return errors;
    }
}
