/*
 * Copyright (c) 2020 CertifAI
 *
 * This program and the accompanying materials are made available under the
 * terms of the Apache License, Version 2.0 which is available at
 * https://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package ai.classifai.server;

import lombok.Getter;
import lombok.Setter;

/**
 * Parameter for server in general
 *
 * @author Chiawei Lim
 */
public class ParamConfig
{
    public final static String PROJECT_NAME_PARAM = "project_name";
    public final static String FILE_SYS_PARAM = "file_sys";

    public final static String ANNOTATE_TYPE_PARAM = "annotation_type";

    public final static String UUID_LIST_PARAM = "uuid_list";
    public final static String LABEL_LIST_PARAM = "label_list";

    public final static String UUID_PARAM = "uuid";
    public final static String IMAGE_PATH_PARAM = "imgpath";

    public final static String EMPTY_ARRAY = "[]";
    public final static String IMAGE_THUMBNAIL_PARAM = "imgthumbnail";
    public final static String IMAGE_SRC_PARAM = "imgsrc";

    public final static String BOUNDING_BOX_PARAM = "bnd_box";
    public final static String SEGMENTATION_PARAM = "seg_content";

    public final static String IMAGEX_PARAM = "imgX";
    public final static String IMAGEY_PARAM = "imgY";
    public final static String IMAGEW_PARAM = "imgW";

    public final static String IMAGEH_PARAM = "imgH";
    public final static String IMAGEORIW_PARAM = "imgOriW";
    public final static String IMAGEORIH_PARAM = "imgOriH";

    public final static String ACTION_KEYWORD = "action";
    public final static String CONTENT = "content";

    public final static String PROGRESS_METADATA = "progress";

    public final static String IMAGE_DEPTH = "img_depth";

    @Getter @Setter private static Integer hostingPort;

}
