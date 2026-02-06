# PARTE 3 - Cuestionario

## 1. ¿Cuál es la diferencia entre git merge y git rebase?

- `git merge` une dos ramas creando un commit adicional y conserva el historial original.

- `git rebase` mueve los commits de una rama sobre otra, reescribiendo el historial y dejándolo más lineal.

## 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer merge?

Si dos ramas modifican la misma línea de un archivo, Git genera un conflicto.

El desarrollador debe resolverlo manualmente editando el archivo y luego ejecutar:

```bash
git add archivo
git commit
```

## 3. ¿Cómo puedes ver gráficamente el historial de merges y ramas en consola?
Se puede ver con el siguiente comando: git log --oneline --graph --all 

## 4. Explica la diferencia entre un commit y un push.

- `commit` guarda los cambios localmente
- `push` envía los cambios locales (commits) al repositorio remoto 

## 5. ¿Para qué sirven git stash y git pop? 

- `git stash` guarda cambios temporales sin hacer commit.

- `git stash pop` pop recupera esos cambios.

## 6. ¿Qué diferencia hay entre HashMap y HashTable? 
 Los HashMap no están sincronizados, no permiten null, es mucho más veloz que
 HashTable