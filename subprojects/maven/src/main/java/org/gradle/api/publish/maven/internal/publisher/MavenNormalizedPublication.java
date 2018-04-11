/*
 * Copyright 2012 the original author or authors.
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

package org.gradle.api.publish.maven.internal.publisher;

import org.gradle.api.publish.PublicationArtifact;
import org.gradle.api.publish.maven.MavenArtifact;

import java.util.Set;

public class MavenNormalizedPublication {

    private final String name;
    private final PublicationArtifact pomArtifact;
    private final MavenProjectIdentity projectIdentity;
    private final Set<PublicationArtifact> allArtifacts;
    private final MavenArtifact mainArtifact;

    public MavenNormalizedPublication(String name, PublicationArtifact pomArtifact, MavenProjectIdentity projectIdentity, Set<PublicationArtifact> allArtifacts, MavenArtifact mainArtifact) {
        this.name = name;
        this.pomArtifact = pomArtifact;
        this.projectIdentity = projectIdentity;
        this.allArtifacts = allArtifacts;
        this.mainArtifact = mainArtifact;
    }

    public String getName() {
        return name;
    }

    public PublicationArtifact getPomArtifact() {
        return pomArtifact;
    }

    public Set<PublicationArtifact> getAllArtifacts() {
        return allArtifacts;
    }

    public MavenProjectIdentity getProjectIdentity() {
        return projectIdentity;
    }

    public MavenArtifact getMainArtifact() {
        return mainArtifact;
    }

}
