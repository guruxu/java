/*
* Copyright 2014 Basis Technology Corp.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package com.basistech.rosette.apimodel;

import java.util.List;

/**
 *  Simple api response data model for categorization
 **/
public final class CategoriesResponse extends Response {

    private final List<Label> categories;
    
    /**
     * Constructor for {@code CategoriesResponse}
     * @param categories list of categories
     */
    public CategoriesResponse(List<Label> categories) {
        this.categories = categories;
    }

    /**
     * get the list of categories
     * @return the list of categories
     */
    public List<Label> getCategories() {
        return categories;
    }

    @Override
    public int hashCode() {
        return categories != null ? categories.hashCode() : 0;
    }

    /**
     * if the param is a {@code CategoriesResponse}, compare contents for equality
     * @param o the object
     * @return whether or not the param object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof CategoriesResponse)) {
            return false;
        }

        CategoriesResponse that = (CategoriesResponse) o;
        return categories != null ? categories.equals(that.getCategories()) : that.categories == null;
    }
}
