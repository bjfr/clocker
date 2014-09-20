/*
 * Copyright 2014 by Cloudsoft Corporation Limited
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
package brooklyn.location.docker.strategy;

import java.util.List;

import brooklyn.entity.Entity;
import brooklyn.entity.container.docker.DockerInfrastructure;
import brooklyn.location.docker.DockerHostLocation;
import brooklyn.management.ManagementContext;

/**
 * Placement strategy for Docker containers in host clusters.
 */
public interface DockerAwarePlacementStrategy  {

    void init(ManagementContext managementContext, DockerInfrastructure infrastructure);

    DockerInfrastructure getDockerInfrastructure();

    List<DockerHostLocation> filterLocations(List<DockerHostLocation> locations, Entity context);

}
