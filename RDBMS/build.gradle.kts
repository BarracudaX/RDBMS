import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    id("org.jetbrains.kotlin.plugin.spring") version "1.8.10"
}

group = "com.arslan"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.springframework:spring-jdbc:5.3.26")
    implementation("org.springframework:spring-core:5.3.26")
    implementation("org.springframework:spring-context:5.3.26")
    implementation("com.h2database:h2:2.1.214")


    testImplementation("org.springframework:spring-test:5.3.26")


}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}