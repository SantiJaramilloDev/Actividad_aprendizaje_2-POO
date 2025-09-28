# 🏦 Actividad de aprendizaje 2 - Programación funcional en Java

## 📌 Descripción

Este proyecto es un prototipo de sistema para una cooperativa, desarrollado en Java con enfoque en **Programación Orientada a Objetos (POO)** y **Programación Funcional**.
El sistema permite:

* Registrar socios.
* Abrir cuentas de ahorro.
* Realizar depósitos y retiros.
* Aplicar intereses a las cuentas.
* Consultar información usando programación funcional con **Streams**.

---

## 🎯 Objetivos de aprendizaje

* Aplicar los pilares de la POO: abstracción, encapsulamiento, herencia y polimorfismo.
* Organizar el código en paquetes siguiendo buenas prácticas de proyectos en Java.
* Utilizar programación funcional con lambdas, `map`, `filter`, `forEach` y `reduce`.
* Manejar excepciones con `try-catch` en operaciones sensibles.

---

## 📂 Estructura del proyecto

```
src/
 ├── main/
 │    └── java/
 │         ├── modelo/
 │         │    ├── Socio.java
 │         │    ├── Cuenta.java
 │         │    └── CuentaAhorros.java
 │         │
 │         ├── transacciones/
 │         │    ├── Transaccion.java
 │         │    ├── Deposito.java
 │         │    └── Retiro.java
 │         │
 │         └── app/
 │              ├── Cooperativa.java
 │              └── Main.java
 

```

---

## ⚙️ Instalación y ejecución

1. Clonar o descargar este repositorio en tu equipo.
2. Abrir el proyecto en **IntelliJ IDEA** o cualquier IDE de Java.
3. Asegurarse de tener instalado **Java 17 o superior**.
4. Ejecutar la clase principal:

   ```
   app.Main
   ```

---

## 🚀 Funcionalidades principales

### POO aplicada

* **Abstracción**: clases `Socio`, `Cuenta`, `CuentaAhorros`.
* **Encapsulamiento**: atributos privados y métodos de acceso.
* **Herencia**: `CuentaAhorros` hereda de `Cuenta`.
* **Polimorfismo**: interfaz `Transaccion` implementada por `Deposito` y `Retiro`.

### Programación funcional

* **Listar socios**: `map` + `forEach`.
* **Filtrar cuentas con saldo mayor a $500.000**: `filter`.
* **Calcular total de saldos**: `reduce`.

### Gestión de errores

* Validación de retiros: no permite retirar más del saldo disponible.
* Validación de cuentas duplicadas para un mismo socio.

---

## 🖥️ Ejemplo de ejecución

```
✅ Depósito de $1000000 realizado en la cuenta A001
✅ Retiro de $200000 realizado en la cuenta A001

--- Socios registrados ---
Ana Pérez
Carlos López

--- Cuentas con saldo mayor a $500000 ---
Cuenta N° A001 | Saldo: $816000.0 | Cuenta de Ahorros | Interés: 2.0%

--- Total de dinero en la cooperativa ---
💰 Total: $816000.0
```

---

## 👨‍💻 Autores

Desarrollado por: **Santiago Jaramillo**
Actividad de aprendizaje 2 **Programación Orientada a Objetos 2**.
