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

package ai.classifai.database.segdb;

import ai.classifai.database.portfoliodb.PortfolioDbQuery;

public class SegDbQuery
{
    public final static String QUEUE = "segmentation.queue";

    public final static String CREATE_PROJECT = "create table if not exists Project (uuid integer, project_id integer, img_path varchar(2000), seg_content varchar(40000), img_depth integer, " +
            "image_x integer, image_y integer, image_w double, image_h double, image_ori_w integer, image_ori_h integer, primary key(uuid, project_id))";

    public final static String CREATE_DATA = "insert into Project values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public final static String RETRIEVE_DATA = "select img_path, seg_metadata, img_depth, image_x, image_y, image_w, image_h, image_ori_w, image_ori_h from Project where uuid = ? and project_id = ?";

    public final static String RETRIEVE_DATA_PATH = "select img_path from Project where uuid = ? and project_id = ?";

    public final static String UPDATE_DATA = "update Project set seg_metadata = ?, image_x = ?, image_y = ?, image_w = ?, image_h = ?, image_ori_w = ?, image_ori_h = ? where uuid = ? and project_id = ?";

    public final static String DELETE_DATA = "delete from Project where uuid = ? and project_id = ?";

    public final static String REMOVE_OBSOLETE_UUID_LIST = PortfolioDbQuery.REMOVE_OBSOLETE_UUID_LIST;
}