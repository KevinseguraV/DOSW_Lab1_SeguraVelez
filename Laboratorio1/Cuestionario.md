

### 7. ¿Qué ventajas tiene Collectors.toMap() frente a un bucle tradicional para llenar un mapa?
Collectors.toMap() permite crear mapas de forma más clara y declarativa, reduciendo código repetitivo. Facilita la lectura, evita errores comunes del manejo manual y se integra naturalmente con Streams.

---

### 8. Si usas una List con objetos y luego aplicas stream().map(), ¿qué tipo de operación estás haciendo?
Se realiza una **operación de transformación**, ya que `map()` convierte cada elemento del stream en otro valor u objeto sin modificar la colección original.

---

### 9. ¿Qué hace el método stream().filter() y qué retorna?
`filter()` evalúa cada elemento según una condición y retorna un **nuevo Stream** que contiene solo los elementos que cumplen dicha condición.

---

### 10. Describe el paso a paso de cómo crear una rama desde develop si es una funcionalidad nueva.
1. Cambiar a la rama `develop`.
2. Actualizar la rama con los últimos cambios.
3. Crear una nueva rama feature desde `develop`.
4. Desarrollar la funcionalidad en esa rama.

---

### 11. ¿Cuál es la diferencia entre crear una rama con git branch y con git checkout -b?
`git branch` solo crea la rama, pero no cambia a ella.  
`git checkout -b` crea la rama y cambia automáticamente a ella en un solo paso.

---

### 12. ¿Por qué es recomendable crear ramas feature/ para nuevas funcionalidades en lugar de trabajar en main directamente?
Porque permite desarrollar sin afectar el código estable, facilita el trabajo en equipo, el control de cambios y la resolución de conflictos antes de integrar la funcionalidad al proyecto principal.
