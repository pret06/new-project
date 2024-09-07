const express = require('express')
const mysql = require('mysql2')

const app = express()
const PORT = process.env.PORT || 3000

app.get('/products', ()=>{
    const {
        pageSize = 10,
        currentPage = 1,
        orderBy = 'createdAt',
        orderDir = 'desc',
        searchBy =  ' ',
        searchFields = []
    } = req.query 

const SearchFieldArray = SearchFields ? searchFields.split(',') : []
const offset = (currentPage - 1) * pageSize

let query = `
SELECT
package.productId,p.productName, p.productImageName, p.productImageURL
     p.brandName,
     p.description,
     p.itemCode,
     p.itemType,
     p.currency,
     p.currencyCode,
     saleAmount,
    p.brochurep.Name,
    p.brochureFileURL,
    p.vendors,
    p.status,
    p.createdBy,
    p.created,
    p.updated,
    p.subCategoryId,
    p.categoryId,
    p.uomId,
    p.shippingMethodId,
    p.shippingTermsId,
    p.paymentTermsId,
    p.categoryName,
    p.subCategoryName,
    p.uomCode,
    p.uomDescription,
    p.organisationName,
    p.organisationId,
    p.vendorInfo FROM products p
    LEFT JOIN VendorsOrganizations v ON p.VendorId = v.vendorId`

if(searchBy && SearchFieldArray.length > 0 ){
    const searchcondition = SearchFieldArray.map(field => `${field} LIKE ?` ).join(' OR')
    query += `WHERE (${searchCondition})`
}
})

query += `ORDER BY ${mysql.escapeId(orderBy)} ${mysql.escape(orderDir)} LIMIT ? OFFSEt ?`

const queryparams = searchBy ? [...Array(SearchFieldArray.length)].fill(`%${searchBy}%`) :


db.query(query, queryparams , (err,results)=>{
    if(err){
        return err
    }
})

db.query('SELECT COUNT (*) AS totalCount FROM Products', (err,countResult)=>{
    if(err){
        return err
    }
    const totalCount = countResult[0].totalCount
    const totalpages = Math.ceil(totalCount/ pageSize)
})

res.json({
   currentPage: +currentPage,
   pageSize:+pageSize,
   totalpages,
   totalCount,
   data: results,
})

app.listen(PORT, ()=>{
    console.log('Port is working fine' + PORT)
})