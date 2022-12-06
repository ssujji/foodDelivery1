<template>

    <v-data-table
        :headers="headers"
        :items="meansOfDelivery"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'MeansOfDeliveryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "deliveryType", value: "deliveryType" },
            ],
            meansOfDelivery : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/meansOfDeliveries'))

            temp.data._embedded.meansOfDeliveries.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.meansOfDelivery = temp.data._embedded.meansOfDeliveries;
        },
        methods: {
        }
    }
</script>

