<template>
  <li><input type="checkbox" v-model="checked" /> 옵션</li>
</template>

<!-- setup을 사용하지 않았을 때 -->
<!-- <script>
import { ref } from 'vue';

const checked = ref(false);
export default {
  name: 'CheckbotItem',
  setup() {
    const checked = ref(false);

    return {
      checked,
    };
  },
};
</script> -->

<!-- setup 사용시 -->
<script setup>
import { ref } from 'vue';

const checked = ref(false);
</script>

<style lang="scss" scoped></style>
