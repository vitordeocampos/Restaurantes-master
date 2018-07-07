use campos

db.createCollection('user');
db.getCollection('user').insert({
    "roles": ["user", "admin"],
    "username": "caioc",
    "password": "$2a$10$Mfk8RFBO78xmMTz5YTCF3OT3Fm3AlXYHJpcKTvSCuPgOBaTnVGvYy",
	"nome": "Vitor",
	"sobrenome": "de Oliveira Campos",
    "enabled": true
});