/*
 * Copyright 2017, The PlantBee Project.
 * All rights reserved.
 *
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 */

package com.bauden.android.plantbee;

public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);

}