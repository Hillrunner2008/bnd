package aQute.maven.dto;

/**
 * The <code>&lt;build&gt;</code> element contains informations required to
 * build the project. Default values are defined in Super POM.
 *
 */
public class BuildDTO {
	/**
	 * This element specifies a directory containing the source of the project.
	 * The generated build system will compile the sources from this directory
	 * when the project is built. The path given is relative to the project
	 * descriptor. The default value is <code>src/main/java</code>.
	 * 
	 */
	public String sourceDirectory = "src/main/java";

	/**
	 * This element specifies a directory containing the script sources of the
	 * project. This directory is meant to be different from the
	 * sourceDirectory, in that its contents will be copied to the output
	 * directory in most cases (since scripts are interpreted rather than
	 * compiled). The default value is <code>src/main/scripts</code>.
	 * 
	 */

	public String scriptSourceDirectory = "src/main/scripts";

	/**
	 * This element specifies a directory containing the unit test source of the
	 * project. The generated build system will compile these directories when
	 * the project is being tested. The path given is relative to the project
	 * descriptor. The default value is <code>src/test/java</code>.
	 * 
	 */

	public String testSourceDirectory = "src/test/java";

	/**
	 * The directory where compiled application classes are placed. The default
	 * value is <code>target/classes</code>.
	 * 
	 */

	public String outputDirectory = "target/classes";

	/**
	 * The directory where compiled test classes are placed. The default value
	 * is <code>target/test-classes</code>.
	 * 
	 */

	public String testOutputDirectory = "target/test-classes";

	/**
	 * A set of build extensions to use from this project.
	 */

	public ExtensionDTO[] extensions;

	/**
	 * The default goal (or phase in Maven 2) to execute when none is specified
	 * for the project. Note that in case of a multi-module build, only the
	 * default goal of the top-level project is relevant, i.e. the default goals
	 * of child modules are ignored. Since Maven 3, multiple goals/phases can be
	 * separated by whitespace.
	 */

	public String defaultGoal;

	/**
	 * This element describes all of the classpath resources such as properties
	 * files associated with a project. These resources are often included in
	 * the final package. The default value is <code>src/main/resources</code>.
	 * 
	 */

	public ResourceDTO[] resources;

	/**
	 * This element describes all of the classpath resources such as properties
	 * files associated with a project's unit tests. The default value is
	 * <code>src/test/resources</code>.
	 * 
	 */
	public ResourceDTO[] testResources;

	/**
	 * The directory where all files generated by the build are placed. The
	 * default value is <code>target</code>.
	 * 
	 */
	public String directory = "target";

	/**
	 * The filename (excluding the extension, and with no path information) that
	 * the produced artifact will be called. The default value is
	 * <code>${artifactId}-${version}</code>.
	 * 
	 */
	public String finalName;

	/**
	 * The list of filter properties files that are used when filtering is
	 * enabled.
	 */

	public String[] filters;

	/**
	 * Default plugin information to be made available for reference by projects
	 * derived from this one. This plugin configuration will not be resolved or
	 * bound to the lifecycle unless referenced. Any local configuration for a
	 * given plugin will override the plugin's entire definition here.
	 * 
	 */

	public PluginManagementDTO pluginManagement;

	/**
	 * The list of plugins to use.
	 */

	public PluginDTO[] plugins;

}
