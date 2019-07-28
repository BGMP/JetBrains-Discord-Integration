/*
 * Copyright 2017-2019 Aljoscha Grebe
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

package com.almightyalpaca.jetbrains.plugins.discord.shared.utils

import org.apache.commons.io.FilenameUtils
import java.nio.file.Path

inline val Path.name: String
    get() = FilenameUtils.getName(toString())

inline val Path.baseName: String
    get() = FilenameUtils.getBaseName(toString())

inline val Path.extension: String
    get() = FilenameUtils.getExtension(toString())