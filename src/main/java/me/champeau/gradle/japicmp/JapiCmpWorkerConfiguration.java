/*
 * Copyright 2003-2012 the original author or authors.
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
package me.champeau.gradle.japicmp;

import me.champeau.gradle.japicmp.report.RichReport;

import java.io.File;
import java.io.Serializable;
import java.util.List;

public class JapiCmpWorkerConfiguration implements Serializable {
    protected final boolean includeSynthetic;
    protected final boolean ignoreMissingClasses;
    protected final List<String> packageIncludes;
    protected final List<String> packageExcludes;
    protected final List<JApiCmpWorkerAction.Archive> oldClasspath;
    protected final List<JApiCmpWorkerAction.Archive> newClasspath;
    protected final List<JApiCmpWorkerAction.Archive> oldArchives;
    protected final List<JApiCmpWorkerAction.Archive> newArchives;
    protected final boolean onlyModified;
    protected final boolean onlyBinaryIncompatibleModified;
    protected final String accessModifier;
    protected final File xmlOutputFile;
    protected final File htmlOutputFile;
    protected final File txtOutputFile;
    protected final boolean failOnModification;
    protected final File buildDir;
    protected final RichReport richReport;

    public JapiCmpWorkerConfiguration(final boolean includeSynthetic,
                                      final boolean ignoreMissingClasses,
                                      final List<String> packageIncludes,
                                      final List<String> packageExcludes,
                                      final List<JApiCmpWorkerAction.Archive> oldClasspath,
                                      final List<JApiCmpWorkerAction.Archive> newClasspath,
                                      final List<JApiCmpWorkerAction.Archive> oldArchives,
                                      final List<JApiCmpWorkerAction.Archive> newArchives,
                                      final boolean onlyModified,
                                      final boolean onlyBinaryIncompatibleModified,
                                      final String accessModifier,
                                      final File xmlOutputFile,
                                      final File htmlOutputFile,
                                      final File txtOutputFile,
                                      final boolean failOnModification,
                                      final File buildDir,
                                      final RichReport richReport) {
        this.includeSynthetic = includeSynthetic;
        this.ignoreMissingClasses = ignoreMissingClasses;
        this.packageIncludes = packageIncludes;
        this.packageExcludes = packageExcludes;
        this.oldClasspath = oldClasspath;
        this.newClasspath = newClasspath;
        this.oldArchives = oldArchives;
        this.newArchives = newArchives;
        this.onlyModified = onlyModified;
        this.onlyBinaryIncompatibleModified = onlyBinaryIncompatibleModified;
        this.accessModifier = accessModifier;
        this.xmlOutputFile = xmlOutputFile;
        this.htmlOutputFile = htmlOutputFile;
        this.txtOutputFile = txtOutputFile;
        this.failOnModification = failOnModification;
        this.buildDir = buildDir;
        this.richReport = richReport;
    }

}