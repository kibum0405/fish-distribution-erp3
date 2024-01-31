<template>
    <v-card outlined>
        <v-card-title>
            RegisterSupplier
        </v-card-title>

        <v-card-text>
            <String label="SupplierId" v-model="value.supplierId" :editMode="editMode"/>
            <String label="SupplierName" v-model="value.supplierName" :editMode="editMode"/>
            <String label="ContactNumber" v-model="value.contactNumber" :editMode="editMode"/>
            <Address offline label="Address" v-model="value.address" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="registerSupplier"
            >
                RegisterSupplier
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'RegisterSupplierCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.supplierId = '';
            this.value.supplierName = '';
            this.value.contactNumber = '';
            this.value.address = {};
        },
        watch: {
        },
        methods: {
            registerSupplier() {
                this.$emit('registerSupplier', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

