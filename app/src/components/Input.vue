<template>
  <input
    :type="type"
    class="input"
    :value="value"
    :placeholder="placeholder"
    v-on:input="$emit('input', $event.target.value)"
  />
</template>

<script>
export default {
  name: "Input",
  props: {
    placeholder: {
      type: String,
      required: true
    },
    type: String,
    value: String
  }
};
</script>

<style scoped lang="scss">
.input {
  padding: 10px;
}
</style>
