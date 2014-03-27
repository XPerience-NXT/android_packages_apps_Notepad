/*
 * Copyright (C) 2008 The Android Open Source Project
 * Copyright (C) 2014 The XPerience Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klozz.xperience.notepad;

import android.test.ActivityInstrumentationTestCase2;
import com.klozz.xperience.notepad.NotesList;

/**
 * Make sure that the main launcher activity opens up properly, which will be
 * verified by {@link #testActivityTestCaseSetUpProperly}.
 */
public class NotePadActivityTest extends ActivityInstrumentationTestCase2<NotesList> {

    /**
     * Creates an {@link ActivityInstrumentationTestCase2} for the {@link NotesList} activity.
     */
    public NotePadActivityTest() {
        super(NotesList.class);
    }

    /**
     * Verifies that the activity under test can be launched.
     */
    public void testActivityTestCaseSetUpProperly() {
        assertNotNull("activity should be launched successfully", getActivity());
    }
}
