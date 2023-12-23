/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 * Copyright (c) 2023 Flint Loader Contributors
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

package net.flintloader.installer.util;

public class Reference {
	public static final String LOADER_NAME = "punch";
	public static final String MINECRAFT_LAUNCHER_MANIFEST = "https://launchermeta.mojang.com/mc/game/version_manifest_v2.json";

	public static final String DEFAULT_META_SERVER = "https://meta.flintloader.net/";
	public static final String DEFAULT_MAVEN_SERVER = "https://maven.flintloader.net/releases";

	static final FlintService[] FLINT_SERVICES = {
			new FlintService(DEFAULT_META_SERVER, DEFAULT_MAVEN_SERVER),
	};
}
