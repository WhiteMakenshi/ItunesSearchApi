
## 🛠️ Stack Tecnológico

### Core del Proyecto
- **Kotlin Multiplatform**: Desarrollo compartido entre plataformas
- **Compose Multiplatform**: UI multiplataforma moderna
- **Gradle Kotlin DSL**: Sistema de compilación configurable

### Dependencias Principales

#### UI & Composición
- `Compose Runtime` - Framework reactivo
- `Compose Foundation` - Componentes base
- `Compose Material 3` - Diseño Material
- `Compose UI` - Elementos UI fundamentales
- `Compose Material Icons Extended` - Iconografía

#### Networking
- **Ktor Client** - Cliente HTTP multiplataforma
  - `ktor-client-core` - Núcleo del cliente
  - `ktor-client-okhttp` - Engine para Android
  - `ktor-client-darwin` - Engine nativo para iOS
  - `ktor-client-negotiation` - Negociación de contenido

#### Inyección de Dependencias
- **Koin** - DI ligero y flexible
  - `koin-core` - Core framework
  - `koin-compose` - Integración con Compose
  - `koin-android` - Bindings para Android
  - `koin-androidx-compose` - Integración con AndroidX

#### Serialización
- **Kotlinx Serialization** - Serialización JSON type-safe

#### Cargar Imágenes
- **Coil** - Carga eficiente de imágenes
  - `coil-compose` - Integración con Compose
  - `coil-network-ktor` - Transport con Ktor

#### Navegación
- **AndroidX Navigation Compose** - Navegación multiplataforma

#### Otros
- `androidx-lifecycle-viewmodel-compose` - ViewModel con Compose
- `androidx-lifecycle-runtime-compose` - Runtime lifecycle
- `androidx-activity-compose` - Actividades con Compose

## 📱 Plataformas Soportadas

### Android
- **Min SDK**: Configurable (versión definida en `gradle.properties`)
- **Target SDK**: Última versión estable
- **Compilación**: JVM 11
- **Namespace**: `com.kmpcourse.itunessearchapi`

### iOS
- **Targets**: 
  - ARM64 (dispositivos reales)
  - Simulator ARM64 (simuladores M1/M2)
- **Framework**: `ComposeApp` (binario estático)
- **Integración**: Soporte nativo con SwiftUI

## 🚀 Características Principales

✅ **Búsqueda de iTunes**: Consulta el API de iTunes para buscar canciones, apps y más  
✅ **Interfaz Multiplataforma**: Una sola codebase para Android e iOS  
✅ **Inyección de Dependencias**: Arquitectura limpia con Koin  
✅ **Networking Robusto**: Cliente HTTP con Ktor  
✅ **Carga de Imágenes Eficiente**: Coil con soporte de red  
✅ **Navegación Moderna**: Compose Navigation para flujos de usuario  
✅ **Material Design 3**: Diseño contemporáneo y consistente  

## ⚙️ Configuración de Compilación

### Gradle Properties
- **Java Compiler**: Compatible con JVM 11
- **Memoria JVM**: Gradle con 4GB, Kotlin daemon con 3GB
- **Features**: 
  - Caché de configuración habilitada
  - Caché de compilación habilitada
  - AndroidX no transitivo para classes

### Repositorios
- Google (Maven)
- Maven Central
- Gradle Plugin Portal

## 📦 Versión Actual
- **Versión**: 1.0
- **Version Code**: 1
- **ID de Aplicación**: `com.kmpcourse.itunessearchapi`

## 🎯 Caso de Uso

Este proyecto es ideal para:
- Aprender **Kotlin Multiplatform Development**
- Desarrollar aplicaciones que consulten APIs REST
- Implementar patrones de arquitectura moderna
- Reutilizar código entre plataformas móviles

---

Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
