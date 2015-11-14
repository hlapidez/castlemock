/*
 * Copyright 2015 Karl Dahlgren
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.fortmocks.core.model.project.service;

import com.fortmocks.core.model.ServiceAdapter;
import com.fortmocks.core.model.TypeIdentifiable;
import com.fortmocks.core.model.project.domain.Project;
import com.fortmocks.core.model.project.dto.ProjectDto;

/**
 * The project service is responsible for providing the basic functionality for all the
 * project services.
 * @author Karl Dahlgren
 * @since 1.0
 * @param <D> The dto project type
 * @see Project
 * @see ProjectDto
 */
public interface ProjectServiceAdapter<D extends TypeIdentifiable> extends ServiceAdapter<D, Long>{

    /**
     * The method provides the functionality to export a project and convert it to a String
     * @param id The id of the project that will be converted and exported
     * @return The project with the provided id as a String
     */
    String exportProject(Long id);

    /**
     * The method provides the functionality to import a project as a String
     * @param projectRaw The project as a String
     */
    void importProject(String projectRaw);

}
