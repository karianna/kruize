/*******************************************************************************
 * Copyright (c) 2019, 2020 IBM Corporation and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package com.kruize.metrics.runtimes.java;

public class JavaMetricCollector
{
    double heap = 0;
    double nonHeap = 0;

    public double getHeap()
    {
        return heap;
    }

    public void setHeap(double heap)
    {
        this.heap = heap;
    }

    public double getNonHeap()
    {
        return nonHeap;
    }

    public void setNonHeap(double nonHeap)
    {
        this.nonHeap = nonHeap;
    }
}
