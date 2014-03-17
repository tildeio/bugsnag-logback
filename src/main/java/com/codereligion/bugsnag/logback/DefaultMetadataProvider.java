/**
 * Copyright 2014 www.codereligion.com
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
package com.codereligion.bugsnag.logback;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.codereligion.bugsnag.logback.MetaDataProvider;
import com.codereligion.bugsnag.logback.model.MetaDataVO;

public class DefaultMetadataProvider implements MetaDataProvider {
  @Override
  public MetaDataVO provide(ILoggingEvent loggingEvent) {
    return new MetaDataVO()
      .addToTab("Logging Details", "message", loggingEvent.getFormattedMessage())
      .addToTab("Logging Details", "level", loggingEvent.getLevel());
  }
}
