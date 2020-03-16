/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.core.data.manager.upsert;

import joptsimple.internal.Strings;
import org.apache.pinot.common.segment.SegmentMetadata;
import org.apache.pinot.core.io.reader.DataFileReader;
import org.apache.pinot.core.segment.index.column.ColumnIndexContainer;
import org.apache.pinot.grigio.common.storageProvider.UpdateLogEntry;
import org.apache.pinot.spi.data.readers.GenericRow;

import java.util.Map;

public class DefaultIndexSegmentCallback implements IndexSegmentCallback {

  public static final DefaultIndexSegmentCallback INSTANCE = new DefaultIndexSegmentCallback();

  private DefaultIndexSegmentCallback(){}

  @Override
  public void init(SegmentMetadata segmentMetadata, Map<String, DataFileReader> virtualColumnIndexReader) {
    // do nothing
  }

  @Override
  public void initOffsetColumn(ColumnIndexContainer offsetColumnContainer) {
    // do noting
  }

  @Override
  public void postProcessRecords(GenericRow row, int docId) {
    // do nothing
  }

  @Override
  public void initVirtualColumn() {
    // do nothing
  }

  @Override
  public void updateVirtualColumn(Iterable<UpdateLogEntry> logEntries) {
    // do nothing
  }

  @Override
  public String getVirtualColumnInfo(long offset) {
    return Strings.EMPTY;
  }
}
