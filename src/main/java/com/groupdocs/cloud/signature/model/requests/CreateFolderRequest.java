/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CreateFolderRequest.java">
 *   Copyright (c) 2003-2019 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.signature.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for createFolder method.
 */
public class CreateFolderRequest {
    
    /**
    * Initializes a new instance of the CreateFolderRequest class.
    */      
    public CreateFolderRequest()
    {
    }

    /**
    * Initializes a new instance of the CreateFolderRequest class.    
    * @param path Folder path to create e.g. 'folder_1/folder_2/'
    * @param storageName Storage name
    */
    public CreateFolderRequest(String path, String storageName)
    {
        this.path = path;
        this.storageName = storageName;
    }

  @SerializedName("path")
  private String path = null;

  @SerializedName("storageName")
  private String storageName = null;

  /**
   * Folder path to create e.g. 'folder_1/folder_2/'
   * @return Folder path to create e.g. 'folder_1/folder_2/'
  **/
  @ApiModelProperty(example = "path_example", required = true, value = "Folder path to create e.g. 'folder_1/folder_2/'")
  public String getpath() {
    return path;
  }

  public void setpath(String path) {
    this.path = path;
  }

  /**
   * Storage name
   * @return Storage name
  **/
  @ApiModelProperty(example = "storageName_example", value = "Storage name")
  public String getstorageName() {
    return storageName;
  }

  public void setstorageName(String storageName) {
    this.storageName = storageName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    CreateFolderRequest request = (CreateFolderRequest) o;
    return Objects.equals(this.path, request.path) &&
        Objects.equals(this.storageName, request.storageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, storageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFolder {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    storageName: ").append(toIndentedString(storageName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
