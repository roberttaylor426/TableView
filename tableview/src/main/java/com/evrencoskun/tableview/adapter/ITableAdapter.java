/*
 * Copyright (c) 2018. Evren Coşkun
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.evrencoskun.tableview.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.evrencoskun.tableview.ITableView;
import com.evrencoskun.tableview.adapter.recyclerview.holder.AbstractViewHolder;

/**
 * Created by evrencoskun on 10/06/2017.
 */

public interface ITableAdapter<CH, RH, C> {

    int getColumnHeaderItemViewType(int position);

    int getRowHeaderItemViewType(int position);

    int getCellItemViewType(int rowPosition, int columnPosition);

    View getCornerView();

    @NonNull
    AbstractViewHolder onCreateCellViewHolder(@NonNull ViewGroup parent, int viewType);

    void onBindCellViewHolder(@NonNull AbstractViewHolder holder, @Nullable Object cellItemModel, int
            columnPosition, int rowPosition);

    @NonNull
    AbstractViewHolder onCreateColumnHeaderViewHolder(@NonNull ViewGroup parent, int viewType);

    void onBindColumnHeaderViewHolder(@NonNull AbstractViewHolder holder, @Nullable Object columnHeaderItemModel,
                                      int columnPosition);

    @NonNull
    AbstractViewHolder onCreateRowHeaderViewHolder(@NonNull ViewGroup parent, int viewType);

    void onBindRowHeaderViewHolder(@NonNull AbstractViewHolder holder, @Nullable Object rowHeaderItemModel, int
            rowPosition);

    @NonNull
    View onCreateCornerView();

    ITableView getTableView();

    /**
     * Sets the listener for changes of data set on the TableView.
     *
     * @param listener The AdapterDataSetChangedListener listener.
     */
    void addAdapterDataSetChangedListener(@NonNull AdapterDataSetChangedListener<CH, RH, C> listener);
}
