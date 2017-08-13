/*
 * Copyright 2016 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.gchq.gaffer.operation.impl;

import org.apache.commons.lang3.exception.CloneFailedException;
import uk.gov.gchq.gaffer.operation.Operation;
import uk.gov.gchq.gaffer.operation.io.Input;

public class DiscardOutput implements
        Operation,
        Input<Object> {

    @Override
    public Object getInput() {
        return null;
    }

    @Override
    public void setInput(final Object input) {
        // No action required
    }

    @Override
    public Operation shallowClone() throws CloneFailedException {
        return new DiscardOutput();
    }

    public static final class Builder extends BaseBuilder<DiscardOutput, Builder>
            implements Input.Builder<DiscardOutput, Object, Builder> {
        public Builder() {
            super(new DiscardOutput());
        }
    }
}
