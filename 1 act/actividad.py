class JdbpProyecto2:
    def __init__(self, nombre, apellido, numero_de_telefono, numero_de_cedula, correo, direccion, fecha_de_nacimiento, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.numero_de_telefono = numero_de_telefono
        self.numero_de_cedula = numero_de_cedula
        self.correo = correo
        self.direccion = direccion
        self.fecha_de_nacimiento = fecha_de_nacimiento
        self.edad = edad

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_apellido(self):
        return self.apellido

    def set_apellido(self, apellido):
        self.apellido = apellido

    def get_numero_de_telefono(self):
        return self.numero_de_telefono

    def set_numero_de_telefono(self, numero_de_telefono):
        self.numero_de_telefono = numero_de_telefono

    def get_numero_de_cedula(self):
        return self.numero_de_cedula

    def set_numero_de_cedula(self, numero_de_cedula):
        self.numero_de_cedula = numero_de_cedula

    def get_correo(self):
        return self.correo

    def set_correo(self, correo):
        self.correo = correo

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_fecha_de_nacimiento(self):
        return self.fecha_de_nacimiento

    def set_fecha_de_nacimiento(self, fecha_de_nacimiento):
        self.fecha_de_nacimiento = fecha_de_nacimiento

    def get_edad(self):
        return self.edad

    def set_edad(self, edad):
        self.edad = edad
        
def imprimir_informacion(self):
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Teléfono: {self.numero_de_telefono}")
        print(f"Cédula: {self.numero_de_cedula}")
        print(f"Correo: {self.correo}")
        print(f"Dirección: {self.direccion}")
        print(f"Fecha de Nacimiento: {self.fecha_de_nacimiento}")
        print(f"Edad: {self.edad}")