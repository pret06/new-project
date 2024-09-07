const { createConnection } = require('mysql2')
const mysql = require('mysql2')
const {DataTypes, Sequelize} = require('sequelize')
const sequelize = require('sequelize')

const db = mysql.createConnection({
     host:'',
     user:'',
     password:'',
     database:''
})

module.exports = db